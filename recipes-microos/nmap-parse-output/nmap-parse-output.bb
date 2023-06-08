SUMMARY = "A tool for analyzing Nmap scans"
DESCRIPTION = "Converts/manipulates/extracts data from a Nmap scan output."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "nmap-parse-output-1.5.1-2.9.noarch.rpm"
RPM_HASH = "d68ac40d71fc49fa7ca2a4baa7e3a067dda5ac7e6273c5639ae96e50bcacd20588236506e493efdc7d2d9905b1d2eb91651b0ccd043decff0923af0e81ad8b57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nmap-parse-output"
RDEPENDS:${PN} += "/bin/bash bash libxslt-tools"

inherit rpm
