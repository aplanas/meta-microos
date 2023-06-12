SUMMARY = "Cryptographic patch attestation for the masses"
DESCRIPTION = "This utility allows an easy way to add end-to-end cryptographic attestation to \
patches sent via mail. It does so by adapting the DKIM email signature standard \
to include cryptographic signatures via the X-Developer-Signature email header. \
 \
If your project workflow doesn't use patches sent via email, then you don't \
need this and should simply start signing your tags and commits."
LICENSE = "MIT-0"

PV = "0.6.3"

RPM_NAME = "python39-patatt-0.6.3-1.1.noarch.rpm"
RPM_HASH = "f72e3a2f7806799d3fd489db3c5f384fba6e80ca02f79434e38ca59c4f62a976f5d0a1f1275ddf593bbb1f7741e6b9f3fe1a3255ac44717e60184cb3d360d707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(patatt) python39-patatt python3dist(patatt)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
