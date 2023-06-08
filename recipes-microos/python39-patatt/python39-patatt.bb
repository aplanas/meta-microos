SUMMARY = "Cryptographic patch attestation for the masses"
DESCRIPTION = "This utility allows an easy way to add end-to-end cryptographic attestation to \
patches sent via mail. It does so by adapting the DKIM email signature standard \
to include cryptographic signatures via the X-Developer-Signature email header. \
 \
If your project workflow doesn't use patches sent via email, then you don't \
need this and should simply start signing your tags and commits."
LICENSE = "MIT-0"

PV = "0.6.2"

RPM_NAME = "python39-patatt-0.6.2-1.5.noarch.rpm"
RPM_HASH = "63675bb491bff1546128d1e275ca71bf37a90f7054a2326d454bd42785eb358ae134206d2be78dfbdf6854c9ce8a51c1a44d07e782182a730d9f69d699088684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(patatt) python39-patatt python3dist(patatt)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
