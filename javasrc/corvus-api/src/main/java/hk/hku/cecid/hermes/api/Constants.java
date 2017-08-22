package hk.hku.cecid.hermes.api;


public class Constants {
    public static final String HEALTHY = "healthy";
    public static final String CONTENT_TYPE = "application/vnd.api+json";
    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";
    public static final String METHOD_DELETE = "DELETE";
    public static final String EBMS_PROTOCOL = "ebms".toLowerCase();
    public static final String AS2_PROTOCOL = "as2".toLowerCase();
    public static final String DEFAULT_EBMS_PARTNERSHIP_DISABLED = "false";
    public static final int DEFAULT_EBMS_PARTNERSHIP_RETRY_INTERVAL = 60000;
    public static final int DEFAULT_EBMS_PARTNERSHIP_RETRY_COUNT = 3;
    public static final String DEFAULT_EBMS_PARTNERSHIP_TRANSPORT_PROTOCOL = "http";
    public static final String DEFAULT_EBMS_PARTNERSHIP_HOSTNAME_VERIFY = "false";
    public static final String DEFAULT_EBMS_PARTNERSHIP_SYNC_REPLY_MODE = "none";
    public static final String DEFAULT_EBMS_PARTNERSHIP_ACK_REQUESTED = "never";
    public static final String DEFAULT_EBMS_PARTNERSHIP_ACK_SIGN_REQUESTED = "never";
    public static final String DEFAULT_EBMS_PARTNERSHIP_DUPLICATE_ELIMINATION = "never";
    public static final String DEFAULT_EBMS_PARTNERSHIP_MESSAGE_ORDER = "NotGuaranteed";
    public static final String DEFAULT_EBMS_PARTNERSHIP_SIGN_REQUESTED = "false";
    public static final String DEFAULT_EBMS_PARTNERSHIP_ENCRYPT_REQUESTED = "false";
    public static final boolean DEFAULT_AS2_PARTNERSHIP_DISABLED = false;
    public static final boolean DEFAULT_AS2_PARTNERSHIP_SYNC_REPLY = false;
    public static final boolean DEFAULT_AS2_PARTNERSHIP_HOSTNAME_VERIFY = false;
    public static final String DEFAULT_AS2_PARTNERSHIP_RECEIPT_ADDRESS = "";
    public static final boolean DEFAULT_AS2_PARTNERSHIP_RECEIPT_REQUIRED = false;
    public static final boolean DEFAULT_AS2_PARTNERSHIP_IS_OUTBOUND_SIGN_REQUIRED = false;
    public static final boolean DEFAULT_AS2_PARTNERSHIP_IS_OUTBOUND_ENCRYPT_REQUIRED = false;
    public static final boolean DEFAULT_AS2_PARTNERSHIP_IS_OUTBOUND_COMPRESS_REQUIRED = false;
    public static final boolean DEFAULT_AS2_PARTNERSHIP_IS_RECEIPT_SIGN_REQUIRED = false;
    public static final boolean DEFAULT_AS2_PARTNERSHIP_IS_INBOUND_SIGN_REQUIRED = false;
    public static final boolean DEFAULT_AS2_PARTNERSHIP_IS_INBOUND_ENCRYPT_REQUIRED= false;
    public static final int DEFAULT_AS2_PARTNERSHIP_RETRY_COUNT = 3;
    public static final int DEFAULT_AS2_PARTNERSHIP_RETRY_INTERVAL = 60000;
    public static final String DEFAULT_AS2_PARTNERSHIP_SIGN_ALGORITHM = "sha1";
    public static final String DEFAULT_AS2_PARTNERSHIP_ENCRYPT_ALGORITHM = "3des";
    public static final String DEFAULT_AS2_PARTNERSHIP_MIC_ALGORITHM = "sha1";
    public static final String RESET_ACTION = "reset";
}
