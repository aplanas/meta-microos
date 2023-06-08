SUMMARY = "Source code of jwt_verify_lib"
DESCRIPTION = "jwt_verify_lib is a library which verifies JSON Web Tokens. It does not provide \
any other features like signing or advanced checks. \
 \
This package contains source code of jwt_verify_lib."
LICENSE = "Apache-2.0"

PV = "20191024"

RPM_NAME = "jwt_verify_lib-source-20191024-1.9.noarch.rpm"
RPM_HASH = "5ca76bd3934101103af3c14ff16b5e511bf71697b70d44e54a593a0da17969ea2769f5245e7ced980311ffb77cd2b085e2d7928853d4f71ddc30ae0a201bd4c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jwt_verify_lib-source"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
