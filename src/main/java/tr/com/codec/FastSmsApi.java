package tr.com.codec;

public class FastSmsApi {

    public static String getSenderInfo(
            String userName,
            String password,
            int responseType,
            String optionalParameters) throws Exception {
        try {
            FastApi service = new FastApi();
            FastApiSoap port = service.getFastApiSoap();
            java.lang.String result = port.getSenderInfo(userName, password, responseType, optionalParameters);
            return result;
        } catch (Exception ex) {
            throw ex;
        }
    }

    public static String getStatus(
            String userName,
            String password,
            String id,
            int responseType,
            String optionalParameters) throws Exception {
        try {
            FastApi service = new FastApi();
            FastApiSoap port = service.getFastApiSoap();
            java.lang.String result = port.getStatus(userName, password, id, responseType, optionalParameters);
            return result;
        } catch (Exception ex) {
            throw ex;
        }
    }

    public static int getCredit(
            String userName,
            String password,
            String optionalParameters) throws Exception {
        try {
            FastApi service = new FastApi();
            FastApiSoap port = service.getFastApiSoap();
            int result = port.getCredit(userName, password, optionalParameters);
            return result;
        } catch (Exception ex) {
            throw ex;
        }
    }

    public static String sendSms(
            String userName,
            String password,
            String sender,
            String phone,
            String messageContent,
            String msgSpecialId,
            boolean isOtn,
            int responseType,
            String headerCode,
            String optionalParameters) throws Exception {
        try {
            FastApi service = new FastApi();
            FastApiSoap port = service.getFastApiSoap();
            java.lang.String result = port.sendSms(userName, password, sender, phone, messageContent, msgSpecialId, isOtn, headerCode, responseType, optionalParameters);
            return result;
        } catch (Exception ex) {
            throw ex;
        }
    }
}
