SUMMARY = "Emit fedmsg messages from mailman3"
DESCRIPTION = "Emit fedmsg messages from mailman3."
LICENSE = "LGPL-2.0-only"

PV = "0.5"

RPM_NAME = "python39-mailman3-fedmsg-plugin-0.5-1.13.noarch.rpm"
RPM_HASH = "e088432647e62f8311e31c62ec44a800002314d1489d7bab4d5ab387832c75c2f8fc409d6ca086578af66a04ac62c935b33e1e1888c8edbd5414a99762d340fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mailman3-fedmsg-plugin) \
python39-mailman3-fedmsg-plugin \
python3dist(mailman3-fedmsg-plugin)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
