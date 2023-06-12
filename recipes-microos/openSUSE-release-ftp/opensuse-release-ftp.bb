SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230604"

RPM_NAME = "openSUSE-release-ftp-20230604-1684.1.aarch64.rpm"
RPM_HASH = "7ed62a9af797bcee5c1ace9f867df841c7ae25a2c670a37ffcfb5eb1bd54ea6ee4b6b24490a60c9107955b3b265d91cc86d0065a92d90fd2209a4eb4acdb3e5f"

RPROVIDES:${PN} += "flavor(ftp) \
openSUSE-release-ftp \
openSUSE-release-ftp(aarch-64) \
product_flavor() \
product_flavor(openSUSE)"
RDEPENDS:${PN} += ""

inherit rpm
