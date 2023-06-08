SUMMARY = "Cryptographic patch attestation for the masses"
DESCRIPTION = "This utility allows an easy way to add end-to-end cryptographic attestation to \
patches sent via mail. It does so by adapting the DKIM email signature standard \
to include cryptographic signatures via the X-Developer-Signature email header. \
 \
If your project workflow doesn't use patches sent via email, then you don't \
need this and should simply start signing your tags and commits."
LICENSE = "MIT-0"

PV = "0.6.2"

RPM_NAME = "python311-patatt-0.6.2-1.5.noarch.rpm"
RPM_HASH = "21c1672f0f8b40c70e5ebee7d3729a3e8c6c904cfed8e016c96a955eafabb96640f6ca9b7909b5aaf75a66966a0726cd3bdd782df0653620655176a815f70721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(patatt) python311-patatt python3dist(patatt)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
