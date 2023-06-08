SUMMARY = "Evented I/O for V8 JavaScript"
DESCRIPTION = "Node.js is a JavaScript runtime built on Chrome's V8 JavaScript engine. Node.js \
uses an event-driven, non-blocking I/O model. Node.js has a package ecosystem \
provided by npm."
LICENSE = "MIT"

PV = "19.9.0"

RPM_NAME = "nodejs19-19.9.0-1.1.aarch64.rpm"
RPM_HASH = "26de61826b5be2ae39e7ce35933f39f5a5532c21b0e844a9c30eee41b62cd5db7027cef9e75275287a8bbc803acc2ee06329eb53ddb9fd01c17fda2e8a14cd65"

RPROVIDES:${PN} += "bundled(ada) bundled(base64) bundled(libuv) bundled(llhttp) bundled(ngtcp2) bundled(node-acorn) bundled(node-acorn-walk) bundled(node-busboy) bundled(node-cjs-module-lexer) bundled(node-corepack) bundled(node-streamsearch) bundled(node-undici) bundled(simdutf) bundled(uvwasi) bundled(v8) nodejs nodejs(abi) nodejs(engine) nodejs19 nodejs19(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/sbin/update-alternatives ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrotlidec.so.1()(64bit) libbrotlienc.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcares.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libnghttp2.so.14()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit) nodejs-common"

inherit rpm
