SUMMARY = "Copr cli"
DESCRIPTION = "CLI tool to run copr."
LICENSE = "GPL-2.0-or-later"

PV = "1.105"

RPM_NAME = "python311-copr-cli-1.105-2.4.noarch.rpm"
RPM_HASH = "debaf30a42abb39ecd0937f77c42ae328f731e4f771e5daa50c82007c46d4d0693a2f95952059fbf71dd029391cb1bfd527e3e9fe6e750b4000595f61a4ba06b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(copr-cli) \
python311-copr-cli \
python3dist(copr-cli)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Jinja2 \
python311-copr \
python311-filelock \
python311-future \
python311-humanize \
python311-requests-gssapi \
python311-responses \
update-alternatives"

inherit rpm
