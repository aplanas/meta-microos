SUMMARY = "Tool to analyze git deps - HTML parts"
DESCRIPTION = "Documentation for git-deps."
LICENSE = "GPL-2.0-only"

PV = "1.0.2+git.1559732444.7c75531"

RPM_NAME = "git-deps-html-1.0.2+git.1559732444.7c75531-4.3.noarch.rpm"
RPM_HASH = "abfbf5c2d2509ed5e53415c56b83be5c9bd87ca94fd1775dcd7d46e5f367c0af6175620672b3c63829e3957b7954c3f8251caf51796903cfb83b00078ca0c9ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-deps-html"
RDEPENDS:${PN} += ""

inherit rpm
