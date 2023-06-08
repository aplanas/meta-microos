SUMMARY = "Structured Configuration Library"
DESCRIPTION = "This package contains documentation files for python311-ZConfig."
LICENSE = "ZPL-2.1"

PV = "3.6.1"

RPM_NAME = "python311-ZConfig-doc-3.6.1-1.3.noarch.rpm"
RPM_HASH = "875c5a8c8b0625ec37c701024111c4ba94a358687c528891f70fd6c86762f19c3240ccf8eced69cd343b0394cb6e8908e093bcc3201c2eba2389f890643ca302"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-ZConfig-doc"
RDEPENDS:${PN} += "python311-ZConfig"

inherit rpm
