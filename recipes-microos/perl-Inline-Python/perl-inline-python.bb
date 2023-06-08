SUMMARY = "Write Perl subs and classes in Python"
DESCRIPTION = "The 'Inline::Python' module allows you to put Python source code directly \
'inline' in a Perl script or module. It sets up an in-process Python \
interpreter, runs your code, and then examines Python's symbol table for \
things to bind to Perl. The process of interrogating the Python interpreter \
for globals only occurs the first time you run your Python code. The \
namespace is cached, and subsequent calls use the cached version. \
 \
This document describes 'Inline::Python', the Perl package which gives you \
access to a Python interpreter. For lack of a better place to keep it, it \
also gives you instructions on how to use 'perlmodule', the Python package \
which gives you access to the Perl interpreter."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.57"

RPM_NAME = "perl-Inline-Python-0.57-1.1.aarch64.rpm"
RPM_HASH = "39fa81300534bd810a2e3a53971ddb4b7c05f1fa3606199be2f9950783d941abb8bc1c12a1ce3106ae7babbafbc156ead70806f09920a3f566cb182c272f970d"

RPROVIDES:${PN} += "perl(Inline::Python) perl(Inline::Python::Boolean) perl(Inline::Python::Function) perl(Inline::Python::Object) perl(Inline::Python::Object::Data) perl-Inline-Python perl-Inline-Python(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpython3.10.so.1.0()(64bit) perl(:MODULE_COMPAT_5.36.0) perl(Digest::MD5) perl(Inline)"

inherit rpm
