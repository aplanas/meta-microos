SUMMARY = "XCCDF files for RHEL, CentOS, Fedora and ScientificLinux"
DESCRIPTION = "Security Content Automation Protocol (SCAP) Security Guide for Redhat/Fedora/CentOS/OracleLinux/ScientificLinux. \
 \
This package contains XCCDF (Extensible Configuration Checklist \
Description Format), OVAL (Open Vulnerability and Assessment \
Language), CPE (Common Platform Enumeration) and DS (Data Stream) \
files to run a compliance test on various Redhat products, CentOS, Oracle Linux, Fedora and ScientificLinux. \
 \
Note that the included profiles are community supplied and not officially supported by SUSE.."
LICENSE = "BSD-3-Clause"

PV = "0.1.66"

RPM_NAME = "scap-security-guide-redhat-0.1.66-1.3.noarch.rpm"
RPM_HASH = "98dd843cae8dfc57eaab9656045fcfb85b7e80cd731889481ed9f661bbf0531c61e9fdba73866bcb1d8e596cb8496d75bc14a5a8020730abf456ba19ec433d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scap-security-guide-redhat"
RDEPENDS:${PN} += ""

inherit rpm
