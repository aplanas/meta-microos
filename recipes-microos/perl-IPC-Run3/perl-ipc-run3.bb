SUMMARY = "Run a Subprocess with Input/Ouput Redirection"
DESCRIPTION = "This module allows you to run a subprocess and redirect stdin, stdout, \
and/or stderr to files and perl data structures. It aims to satisfy 99% of \
the need for using 'system', 'qx', and 'open3' with a simple, extremely \
Perlish API. \
 \
Speed, simplicity, and portability are paramount. (That's speed of Perl \
code; which is often much slower than the kind of buffered I/O that this \
module uses to spool input to and output from the child command.)"
LICENSE = "BSD-2-Clause | GPL-2.0+ | Artistic-1.0"

PV = "0.048"

RPM_NAME = "perl-IPC-Run3-0.048-1.26.noarch.rpm"
RPM_HASH = "a53719b5a23f4c1609b9425742a33010461ad59a87134e8fc20efc04a764e24888f6768ce9ddb37379b23946aa87b1e450bfdf808983d60e854905af3a2388fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(IPC::Run3) perl(IPC::Run3::ProfArrayBuffer) perl(IPC::Run3::ProfLogReader) perl(IPC::Run3::ProfLogger) perl(IPC::Run3::ProfPP) perl(IPC::Run3::ProfReporter) perl-IPC-Run3"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
