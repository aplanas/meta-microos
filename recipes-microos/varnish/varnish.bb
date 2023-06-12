SUMMARY = "Accelerator for HTTP services"
DESCRIPTION = "Varnish is an HTTP accelerator. Often called Reverse Proxy, it is an \
application that stores (caches) documents that have been requested \
over the HTTP protocol. \
 \
Based on certain criteria, the next client requesting the document is either \
given the cached document, or a 'fresh' document requested from a backend \
server. The purpose of this is to minimize the requests going to the backend \
server(s) by serving the same document to potentially many users."
LICENSE = "BSD-2-Clause"

PV = "7.2.1"

RPM_NAME = "varnish-7.2.1-1.3.aarch64.rpm"
RPM_HASH = "876c822757a9e881c75e8ef1f644cc8192b542e9c7e2f01dc7b6b2fc4722b10aabdf2b41fc64062625327d526074676ffc12b56d5d251edbfe429515f1e8c5e0"

RPROVIDES:${PN} += "config(varnish) \
libvmod_blob.so()(64bit) \
libvmod_cookie.so()(64bit) \
libvmod_debug.so()(64bit) \
libvmod_directors.so()(64bit) \
libvmod_proxy.so()(64bit) \
libvmod_purge.so()(64bit) \
libvmod_std.so()(64bit) \
libvmod_unix.so()(64bit) \
libvmod_vtc.so()(64bit) \
varnish \
varnish(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
/usr/sbin/groupadd \
/usr/sbin/useradd \
c_compiler \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libpcre2-8.so.0()(64bit) \
libreadline.so.8()(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libvarnishapi.so.3()(64bit) \
libvarnishapi.so.3(LIBVARNISHAPI_3.0)(64bit)"

inherit rpm
