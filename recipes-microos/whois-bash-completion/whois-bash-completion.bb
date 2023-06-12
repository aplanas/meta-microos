SUMMARY = "Bash completion for whois"
DESCRIPTION = "bash command line completion support for whois."
LICENSE = "GPL-2.0-or-later"

PV = "5.5.17"

RPM_NAME = "whois-bash-completion-5.5.17-1.1.aarch64.rpm"
RPM_HASH = "b0f864364ce003fab8c25a9a33d237770164f3a39d16928055e432b8af5ee2bdafe64d3c7e488fc9bf1d15b5b5c422798e12ad5c9699eaab30729f142f331275"

RPROVIDES:${PN} += "whois-bash-completion \
whois-bash-completion(aarch-64)"
RDEPENDS:${PN} += "bash-completion \
whois"

inherit rpm
