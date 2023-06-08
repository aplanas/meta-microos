SUMMARY = "A little tool to send messages to an XMPP contact or MUC"
DESCRIPTION = "A little tool to send messages to an XMPP contact or MUC."
LICENSE = "BSD-2-Clause"

PV = "0.5.6"

RPM_NAME = "go-sendxmpp-0.5.6-1.3.aarch64.rpm"
RPM_HASH = "4782b2875212f194349df9970731ff70c659eff34c5bd61a81bf3a18bd572f7db703fb851abcb5c793906c108f39b5d0d0eb2a69ec51f1681db6a1bd4729764a"

RPROVIDES:${PN} += "go-sendxmpp go-sendxmpp(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
