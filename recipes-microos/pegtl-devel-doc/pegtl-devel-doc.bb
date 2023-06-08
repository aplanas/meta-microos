SUMMARY = "Parsing Expression Grammar (PEG) Template Library"
DESCRIPTION = "This package contains the development documentation for \
PEGTL (Parsing Expression Grammar Template Library)."
LICENSE = "MIT"

PV = "3.2.7"

RPM_NAME = "pegtl-devel-doc-3.2.7-1.2.noarch.rpm"
RPM_HASH = "ac4d2fa83efec2b46a2efa4ba4b337f2442830d8b23b14d4428823ad86533ded7c5e49c0f93e4eb4d5f9348f059d6fbd740e62e8d13a9e48527bf0cdf7e03cdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pegtl-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
