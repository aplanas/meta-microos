SUMMARY = "SQL full-text search engine"
DESCRIPTION = "Sphinx is a standalone search engine providing size-efficient and \
relevant full-text search functions to other applications. Sphinx \
integrates with SQL databases and scripting languages. \
 \
Data source drivers support fetching data either via direct \
connection to MySQL, PostgreSQL, or from a pipe in a custom XML \
format. \
 \
The Search API is natively ported to PHP, Python, Perl, Ruby, Java, \
and also available as a pluggable MySQL storage engine. \
 \
Sphinx is an acronym which is officially decoded as SQL Phrase Index."
LICENSE = "GPL-2.0-only"

PV = "2.2.11"

RPM_NAME = "sphinx-2.2.11-7.7.aarch64.rpm"
RPM_HASH = "ad44e1db98d0b04700cf3e2f5ada37663c2cea7d6c91c70ec3014a058cf57c92a9874a9ca13fb6315c6583082e03926b9cd8db91a5b799a7511528d60e881e4e"

RPROVIDES:${PN} += "config(sphinx) searchd sphinx sphinx(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/getent /usr/bin/mkdir /usr/bin/touch /usr/sbin/useradd fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libexpat.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libmariadb.so.3()(64bit) libmariadb.so.3(libmysqlclient_18)(64bit) libpq.so.5()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libz.so.1()(64bit) logrotate"

inherit rpm
