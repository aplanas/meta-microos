SUMMARY = "Ruby/EventMachine library"
DESCRIPTION = "EventMachine implements a fast, single-threaded engine for arbitrary network \
communications. It's extremely easy to use in Ruby. EventMachine wraps all \
interactions with IP sockets, allowing programs to concentrate on the \
implementation of network protocols. It can be used to create both network \
servers and clients. To create a server or client, a Ruby program only needs \
to specify the IP address and port, and provide a Module that implements the \
communications protocol. Implementations of several standard network protocols \
are provided with the package, primarily to serve as examples. The real goal \
of EventMachine is to enable programs to easily interface with other programs \
using TCP/IP, especially if custom protocols are required."
LICENSE = "Ruby | GPL-2.0-only"

PV = "1.2.7"

RPM_NAME = "ruby3.2-rubygem-eventmachine-1.2.7-1.34.aarch64.rpm"
RPM_HASH = "41264be164f4b79274410daff54d4c91c4ed701cc0a589b2571cc4eb497686d2977f91669abf1cd765e8e5eaec63e5c1d07e209e95690bde0c758cb8e4efb4bd"

RPROVIDES:${PN} += "ruby3.2-rubygem-eventmachine ruby3.2-rubygem-eventmachine(aarch-64) rubygem(eventmachine) rubygem(ruby:3.2.0:eventmachine) rubygem(ruby:3.2.0:eventmachine:1) rubygem(ruby:3.2.0:eventmachine:1.2) rubygem(ruby:3.2.0:eventmachine:1.2.7)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libruby3.2.so.3.2()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ruby(abi)"

inherit rpm
