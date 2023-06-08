SUMMARY = "Python Markdown parser with renderers and plugins"
DESCRIPTION = "A Python Markdown parser with renderers and plugins, \
compatible with sane CommonMark rules."
LICENSE = "BSD-3-Clause"

PV = "2.0.5"

RPM_NAME = "python310-mistune-2.0.5-1.1.noarch.rpm"
RPM_HASH = "7d507aee31b3556b84aee1bbe606abbe4e265dec025e5ff3929e38d69cd53a88a4a28c8014fb7cbb6167b4b6f8e8605e55fc6e884497d3c012d95b491584ba90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mistune python3.10dist(mistune) python310-mistune python3dist(mistune)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
