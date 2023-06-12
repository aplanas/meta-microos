SUMMARY = "Static website generator written in Go"
DESCRIPTION = "Hugo is a static HTML and CSS website generator written in Go. It is optimized \
for speed, ease of use, and configurability, and designed to work well for any \
kind of website including blogs, tumbles, and docs. Hugo takes a directory with \
Markdown and templates and renders them into a full HTML website, typically in a \
fraction of a second. You can run Hugo from any directory, which works well for \
shared hosts and other systems where you don’t have a privileged account. Hugo \
provides a Privacy Config that can assist with General Data Protection \
Regulation (GDPR) compliance issues. \
 \
https://gohugo.io/"
LICENSE = "Apache-2.0"

PV = "0.112.6"

RPM_NAME = "hugo-0.112.6-1.1.aarch64.rpm"
RPM_HASH = "9c66590cc9d333d494ce3f4ac368333d83a65b87389c9793cba470217f10721d47a02eb27ba157754a7fb7e14346bbd34390cdb3d40a585455540b887b734dc1"

RPROVIDES:${PN} += "hugo hugo(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libsass-3.6.5.so.1()(64bit) libwebp.so.7()(64bit)"

inherit rpm
