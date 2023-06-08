SUMMARY = "Redirect connection through proxy servers"
DESCRIPTION = "ProxyChains NG is based on ProxyChains. \
 \
ProxyChains NG hooks network-related (TCP only) libc functions in dynamically \
linked programs via a preloaded DSO (dynamic shared object) and redirects the \
connections through one or more SOCKS4a/5 or HTTP proxies. \
 \
Since Proxy Chains NG relies on the dynamic linker, statically linked binaries \
are not supported. \
 \
Adjust ~/.proxychains/proxychains.conf for your Proxy and use ProxyChains NG \
with \
 \
    proxychains4 application"
LICENSE = "GPL-2.0-only"

PV = "4.16"

RPM_NAME = "proxychains-ng-4.16-1.6.aarch64.rpm"
RPM_HASH = "82113c50a46efc87f052a5088187f7281e7bc42865646450985f58dfbd9127a7500269df255c46f8085254c195b4a570c2cdbef9c7e585fdc68537c4b6b3caff"

RPROVIDES:${PN} += "config(proxychains-ng) libproxychains4.so()(64bit) proxychains proxychains-ng proxychains-ng(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
