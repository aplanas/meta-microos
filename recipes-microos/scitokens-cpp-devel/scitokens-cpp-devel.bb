SUMMARY = "Header files for the libscitokens public interfaces"
DESCRIPTION = "SciTokens provide a token format for distributed authorization. The tokens are \
self-describing, can be verified in a distributed fashion (no need to contact \
the issuer to determine if the token is valid). This is convenient for a \
federated environment where several otherwise-independent storage endpoints \
want to delegate trust for an issuer for managing a storage allocation."
LICENSE = "Apache-2.0"

PV = "0.6.3"

RPM_NAME = "scitokens-cpp-devel-0.6.3-2.1.aarch64.rpm"
RPM_HASH = "880f177ccfd29af95ccc8e6eb0131c168f227afccdadb43a42144f3d31275f750d79233f2f8a89b5696ea65f992a5e4b72845fdc140d3424ba7e955417032155"

RPROVIDES:${PN} += "scitokens-cpp-devel scitokens-cpp-devel(aarch-64)"
RDEPENDS:${PN} += "libSciTokens0"

inherit rpm
