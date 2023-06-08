SUMMARY = "Pluggable transport proxy for Tor"
DESCRIPTION = "A tool that attempts to circumvent censorship by transforming the Tor traffic \
between the client and the bridge. This way censors, who usually monitor traffic \
between the client and the bridge, will see innocent-looking transformed traffic \
instead of the actual Tor traffic."
LICENSE = "BSD-2-Clause & GPL-3.0-only"

PV = "0.0.13"

RPM_NAME = "obfs4-0.0.13-1.8.aarch64.rpm"
RPM_HASH = "a46d68d028df9a072100ef2c4ab73a57e8debfa48f2aa18cdb0a1ff8cd6618168094440eb8b3338c5dca48d3d7cb76f6ea2bfd9195800f2e5089dd92bc57b7e4"

RPROVIDES:${PN} += "obfs4 obfs4(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
