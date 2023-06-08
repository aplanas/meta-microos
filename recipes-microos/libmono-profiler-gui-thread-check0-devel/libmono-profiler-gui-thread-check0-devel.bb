SUMMARY = "Profiler for gtk-sharp3"
DESCRIPTION = "A profiler called 'gui-thread-check' is included as \
part of the install for debugging purposes."
LICENSE = "GPL-2.0-only"

PV = "2.99.4"

RPM_NAME = "libmono-profiler-gui-thread-check0-devel-2.99.4-6.11.aarch64.rpm"
RPM_HASH = "c3a2a89d66591c72e88bbe1bffaa2b2c6af3680e6b58e3909efe8e000fadb683cf1df9f45e0931ed01aefc990c00a2c5b992db41029bc1ecdd0a5268301a8350"

RPROVIDES:${PN} += "libmono-profiler-gui-thread-check0-devel libmono-profiler-gui-thread-check0-devel(aarch-64)"
RDEPENDS:${PN} += "libmono-profiler-gui-thread-check0"

inherit rpm
