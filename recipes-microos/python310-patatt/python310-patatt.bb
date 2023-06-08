SUMMARY = "Cryptographic patch attestation for the masses"
DESCRIPTION = "This utility allows an easy way to add end-to-end cryptographic attestation to \
patches sent via mail. It does so by adapting the DKIM email signature standard \
to include cryptographic signatures via the X-Developer-Signature email header. \
 \
If your project workflow doesn't use patches sent via email, then you don't \
need this and should simply start signing your tags and commits."
LICENSE = "MIT-0"

PV = "0.6.2"

RPM_NAME = "python310-patatt-0.6.2-1.5.noarch.rpm"
RPM_HASH = "33564450f38d4e83b7b3dc634986eedbbe7465c9bba3f2966f9605db9d7fcda10c5f4d31c8d626fd3dc64e96ec5b8c566efd3a51495349a5eafe8d7b7642106f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-patatt python3.10dist(patatt) python310-patatt python3dist(patatt)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
