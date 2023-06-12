SUMMARY = "Cryptographic patch attestation for the masses"
DESCRIPTION = "This utility allows an easy way to add end-to-end cryptographic attestation to \
patches sent via mail. It does so by adapting the DKIM email signature standard \
to include cryptographic signatures via the X-Developer-Signature email header. \
 \
If your project workflow doesn't use patches sent via email, then you don't \
need this and should simply start signing your tags and commits."
LICENSE = "MIT-0"

PV = "0.6.3"

RPM_NAME = "python310-patatt-0.6.3-1.1.noarch.rpm"
RPM_HASH = "fca6b6a108aaa346cda10b3667a90772e3b202d1f82946f42e1c29eb0fbf0462d5faee4b30bfeabc57521fbb1696f5fbfdf5f4cd74edfd57c47c00b374b30d2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-patatt python3.10dist(patatt) python310-patatt python3dist(patatt)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
