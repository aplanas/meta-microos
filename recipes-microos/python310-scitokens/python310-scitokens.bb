SUMMARY = "SciToken reference implementation library"
DESCRIPTION = "SciTokens provide a token format for distributed authorization. The tokens are \
self-describing, can be verified in a distributed fashion (no need to contact \
the issuer to determine if the token is valid). This is convenient for a \
federated environment where several otherwise-independent storage endpoints \
want to delegate trust for an issuer for managing a storage allocation."
LICENSE = "Apache-2.0"

PV = "1.7.4"

RPM_NAME = "python310-scitokens-1.7.4-1.1.noarch.rpm"
RPM_HASH = "30c52258b95585f11e2aedf52bfd33b12802b691e62bfdf2b5a7d8060714d6d251d808993f257b6193999f69a3a469467a7d4486e6d1e257c2cd13b0b2cf67b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scitokens \
python3.10dist(scitokens) \
python310-scitokens \
python3dist(scitokens)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-PyJWT \
update-alternatives"

inherit rpm
