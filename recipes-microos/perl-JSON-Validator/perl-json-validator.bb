SUMMARY = "Validate data against a JSON schema"
DESCRIPTION = "JSON::Validator is a data structure validation library based around at \
https://json-schema.org/. This module can be used directly with a JSON \
schema or you can use the elegant DSL schema-builder JSON::Validator::Joi \
to define the schema programmatically."
LICENSE = "Artistic-2.0"

PV = "5.14"

RPM_NAME = "perl-JSON-Validator-5.14-1.1.noarch.rpm"
RPM_HASH = "95d8670aed94ca031b277e5699bf2d41a55bf2e94753c53cb7094753c85bc04427d94d22423f6eaa707478f718922cb5457274c6f150bd83b333946637b4f3e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(JSON::Validator) perl(JSON::Validator::Error) perl(JSON::Validator::Formats) perl(JSON::Validator::Joi) perl(JSON::Validator::Schema) perl(JSON::Validator::Schema::Draft201909) perl(JSON::Validator::Schema::Draft4) perl(JSON::Validator::Schema::Draft6) perl(JSON::Validator::Schema::Draft7) perl(JSON::Validator::Schema::OpenAPIv2) perl(JSON::Validator::Schema::OpenAPIv3) perl(JSON::Validator::Store) perl(JSON::Validator::URI) perl(JSON::Validator::Util) perl-JSON-Validator"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(List::Util) perl(Mojolicious) perl(YAML::XS)"

inherit rpm
