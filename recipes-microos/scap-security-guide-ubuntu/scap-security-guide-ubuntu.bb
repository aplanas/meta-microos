SUMMARY = "XCCDF files for Ubuntu"
DESCRIPTION = "Security Content Automation Protocol (SCAP) Security Guide for Ubuntu. \
 \
This package contains XCCDF (Extensible Configuration Checklist \
Description Format), OVAL (Open Vulnerability and Assessment \
Language), CPE (Common Platform Enumeration) and DS (Data Stream) \
files to run a compliance test on Ubuntu. \
 \
Note that the included profiles are community supplied and not officially supported by SUSE.."
LICENSE = "BSD-3-Clause"

PV = "0.1.66"

RPM_NAME = "scap-security-guide-ubuntu-0.1.66-1.3.noarch.rpm"
RPM_HASH = "4017ed3dc729bae699e484f7ad92e9018a1be97371f260291ec4c8e58c1e67af08be51f8d242d254377faa4df6e21edb75c87a4c919c9a89d6680e3075b45551"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scap-security-guide-ubuntu"
RDEPENDS:${PN} += ""

inherit rpm
