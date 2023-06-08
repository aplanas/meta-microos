SUMMARY = "Additional mobile libraries"
DESCRIPTION = "Yet another SIP003 plugin for shadowsocks, based on v2ray \
 \
This package provide source code for shadowsocks-v2ray-plugin"
LICENSE = "MIT"

PV = "1.3.1+git20210506.ddd7ab4"

RPM_NAME = "golang-github-shadowsocks-v2ray-plugin-1.3.1+git20210506.ddd7ab4-1.10.noarch.rpm"
RPM_HASH = "55d4bf9d7462c713630ffe1121c139307721e9a9662480a9e05d3af026bd1c1a40862008ef96a02088ed4ff07d4ce2e207353be012d61602a2ae08f35b665f20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-shadowsocks-v2ray-plugin"
RDEPENDS:${PN} += "golang-github-v2fly-v2ray-core"

inherit rpm
