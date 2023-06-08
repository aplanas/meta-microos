SUMMARY = "Library for package, patch, pattern and product management"
DESCRIPTION = "libzypp is the package management library that powers applications \
like YaST, zypper and the openSUSE/SLE implementation of PackageKit. \
 \
libzypp provides functionality for a package manager: \
 \
  * An API for package repository management, supporting most common \
    repository metadata formats and signed repositories. \
  * An API for solving packages, products, patterns and patches \
    (installation, removal, update and distribution upgrade \
    operations) dependencies, with additional features like locking. \
  * An API for commiting the transaction to the system over a rpm \
    target. Supporting deltarpm calculation, media changing and \
    installation order calculation. \
  * An API for browsing available and installed software, with some \
    facilities for programs with an user interface."
LICENSE = "GPL-2.0+"

PV = "17.31.11"

RPM_NAME = "libzypp-17.31.11-1.1.aarch64.rpm"
RPM_HASH = "72e5cb5decb544a5556c6742ba3141dfd5dd27a5361ff7535d747c7018cc63c886c906cb4b605b9b5262801e67a834a8ac7ae10779429a0ef8fde9be7b8080a2"

RPROVIDES:${PN} += "config(libzypp) libzypp libzypp(aarch-64) libzypp(plugin) libzypp(plugin:appdata) libzypp(plugin:commit) libzypp(plugin:repoverification) libzypp(plugin:services) libzypp(plugin:system) libzypp(plugin:urlresolver) libzypp(repovarexpand) libzypp.so.1722()(64bit) libzypp.so.1722(ZYPP_plain)(64bit) yast2-packagemanager"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libboost_thread.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libcurl4 libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgpgme.so.11()(64bit) libgpgme.so.11(GPGME_1.0)(64bit) libgpgme.so.11(GPGME_1.1)(64bit) libprotobuf-lite-3.21.12.so()(64bit) libproxy.so.1()(64bit) libproxy.so.1(LIBPROXY_0.4.16)(64bit) librpm.so.9()(64bit) librpmio.so.9()(64bit) libsigc-2.0.so.0()(64bit) libsolv-tools libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.6)(64bit) libyaml-cpp.so.0.7()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.3.3)(64bit) libzck.so.1()(64bit) libzstd.so.1()(64bit) rpm"

inherit rpm
