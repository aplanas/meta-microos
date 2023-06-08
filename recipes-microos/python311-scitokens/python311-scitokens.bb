SUMMARY = "SciToken reference implementation library"
DESCRIPTION = "SciTokens provide a token format for distributed authorization. The tokens are \
self-describing, can be verified in a distributed fashion (no need to contact \
the issuer to determine if the token is valid). This is convenient for a \
federated environment where several otherwise-independent storage endpoints \
want to delegate trust for an issuer for managing a storage allocation."
LICENSE = "Apache-2.0"

PV = "1.7.4"

RPM_NAME = "python311-scitokens-1.7.4-1.1.noarch.rpm"
RPM_HASH = "bd0971f2cc4da177eba13f6c36cfb874e6aa120c0546ef62fd1f43b760fc5d6e99b40f819a6a656d2de4197da174a8dd1438ef0cd9d13ad75d70a6363aa416f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(scitokens) python311-scitokens python3dist(scitokens)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-PyJWT update-alternatives"

inherit rpm
