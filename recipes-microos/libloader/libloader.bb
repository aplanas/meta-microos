SUMMARY = "Resource Loading Framework"
DESCRIPTION = "LibLoader is a general purpose resource loading framework. It has been \
designed to allow to load resources from any physical location and to \
allow the processing of that content data in a generic way, totally \
transparent to the user of that library."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libloader-1.1.6-1.4.noarch.rpm"
RPM_HASH = "df62cae8132e4a7d53277caa865e8fa64aab0571d538317e656ab9e337a05d4a9a647ee06a29033728613ad552a88c89c7c42c31d5f43c25f1ab554a5cad3f9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libloader"
RDEPENDS:${PN} += "java \
jpackage-utils \
libbase"

inherit rpm
