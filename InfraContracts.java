package app.models;

public final class InfraContracts {
    private InfraContracts() {}

    public static final String ADMIN_BACKEND_DYNAMODB = "admin-backend_dynamodb";
    public static final String AUDIT_LOGGER_DYNAMODB = "audit-logger_dynamodb";
    public static final String DOCUMENT_STORAGE_S3 = "document-storage_s3";
    public static final String RULES_ENGINE_DYNAMODB = "rules-engine_dynamodb";
}
