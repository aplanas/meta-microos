SUMMARY = "Evented I/O for V8 JavaScript"
DESCRIPTION = "Node.js is a JavaScript runtime built on Chrome's V8 JavaScript engine. Node.js \
uses an event-driven, non-blocking I/O model. Node.js has a package ecosystem \
provided by npm."
LICENSE = "MIT"

PV = "18.16.0"

RPM_NAME = "nodejs18-18.16.0-1.1.aarch64.rpm"
RPM_HASH = "f828f47b72d56042a1de0dd206acdf45f7e2a2194ee0596028bf2e7975d19d23faa978c305f11bb1b1b38fef90260aad411d1b9b7fceb742a8cd13eb778dace8"

RPROVIDES:${PN} += "bundled(ada) bundled(base64) bundled(libuv) bundled(llhttp) bundled(ngtcp2) bundled(node-acorn) bundled(node-acorn-walk) bundled(node-busboy) bundled(node-cjs-module-lexer) bundled(node-corepack) bundled(node-streamsearch) bundled(node-undici) bundled(simdutf) bundled(uvwasi) bundled(v8) nodejs nodejs(abi) nodejs(engine) nodejs18 nodejs18(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/sbin/update-alternatives ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrotlidec.so.1()(64bit) libbrotlienc.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcares.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libnghttp2.so.14()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit) nodejs-common"

inherit rpm
