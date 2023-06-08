SUMMARY = "Rule files for Xindy"
DESCRIPTION = "xindy is an index processor that can be used to generate book-like \
indexes for arbitrary document-preparation systems. \
 \
This package contains the rule files (the knowledge base) of xindy."
LICENSE = "GPL-2.0+"

PV = "2.5.1"

RPM_NAME = "xindy-rules-2.5.1-2.24.noarch.rpm"
RPM_HASH = "5757005a79d0c98d12765849bccb0fbc869c121cb0ed4478518f7161a288fedce0718d844f6083b6d6a637b1b09f4bd5edf7c59e0bb49eb0b49b0973810df832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xindy-rules"
RDEPENDS:${PN} += ""

inherit rpm
