SUMMARY = "XCCDF files for SUSE Linux and openSUSE"
DESCRIPTION = "Security Content Automation Protocol (SCAP) Security Guide for SUSE Linux. \
 \
This package contains XCCDF (Extensible Configuration Checklist \
Description Format), OVAL (Open Vulnerability and Assessment \
Language), CPE (Common Platform Enumeration) and DS (Data Stream) \
files to run a compliance test on SLE12, SLE15 and openSUSE \
 \
SUSE supported in this version of scap-security-guide: \
 \
- DISA STIG profile for SUSE Linux Enterprise Server 12 and 15 \
- PCI-DSS profile for SUSE Linux Enterprise Server 12 and 15 \
- HIPAA profile for SUSE Linux Enterprise Server 12 and 15 \
 \
Other profiles, like the CIS profile, are community supplied and \
not officially supported by SUSE."
LICENSE = "BSD-3-Clause"

PV = "0.1.66"

RPM_NAME = "scap-security-guide-0.1.66-1.3.noarch.rpm"
RPM_HASH = "a23f932eb4c5f93af7358a4f1ddabb7f754d4974417c7bacd501032116df88444c066277852590f6c816b601e0d193b9a00effc70b8fe69f117ded2e1101a41f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scap-security-guide"
RDEPENDS:${PN} += "coreutils findutils gawk grep sed sudo zypper"

inherit rpm
