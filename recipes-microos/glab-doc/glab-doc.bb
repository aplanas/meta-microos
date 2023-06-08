SUMMARY = "Documentation for GLab"
DESCRIPTION = "glab is a command line tool bringing GitLab's features to the command line."
LICENSE = "MIT"

PV = "1.29.1"

RPM_NAME = "glab-doc-1.29.1-1.1.noarch.rpm"
RPM_HASH = "6b541dd0b09fdd283ae41b20fe040c7d176ea656a03dc3b5d3376d7f84495b7c5c48ae3bf180c1eb5404f4040abf87349db5d14b7edeaafcf2cf168390ec095b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-doc"
RDEPENDS:${PN} += ""

inherit rpm
