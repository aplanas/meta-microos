SUMMARY = "YaST Installation Packages"
DESCRIPTION = "YaST tools for installing your system."
LICENSE = "MIT"

PV = "20220411"

RPM_NAME = "patterns-yast-yast2_install_wf-20220411-1.4.aarch64.rpm"
RPM_HASH = "b0ded87ed9ae9e0db43680bb57c8b6d4361c4373a11ae20c335f5eb572f88b3c3a0b7db630a61fe4884dc9b825bebb3dd64a1b95fc9645cf056b6802a2c93c3e"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() patterns-yast-yast2_install_wf patterns-yast-yast2_install_wf(aarch-64)"
RDEPENDS:${PN} += "libyui-ncurses-pkg yast2-bootloader yast2-installation yast2-network yast2-ntp-client yast2-users"

inherit rpm
