SUMMARY = "XML Character Entities"
DESCRIPTION = "XML encodings for the 19 standard character entity sets defined in \
non-normative Annex D of [ISO 8879:1986]."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "xmlcharent-0.3-429.4.noarch.rpm"
RPM_HASH = "cda98d420ef4436544eafcd3449b24e9d941dd9f58978b11c1d7a7223d21d044442d39d2b82ccb680b8fcde9fbcb1712ff100c2711e1ba79a915ff006024d583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmlcharent"
RDEPENDS:${PN} += "/bin/sh \
sgml-skel"

inherit rpm
