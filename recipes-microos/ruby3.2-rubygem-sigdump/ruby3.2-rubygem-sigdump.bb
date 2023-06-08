SUMMARY = "Setup signal handler which dumps backtrace of running threads and"
DESCRIPTION = "Setup signal handler which dumps backtrace of running threads and number of \
allocated objects per class. Require 'sigdump/setup', send SIGCONT, and see \
/tmp/sigdump-<pid>.log."
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "ruby3.2-rubygem-sigdump-0.2.4-2.28.aarch64.rpm"
RPM_HASH = "7b4c4cca46ec518a2f804605e343a532bcc06d9b3961428501938fffa08d59228747887178ffe30a74757b3761ee0dcc82aba9e6d1bbbcdaaa469e6986bf24d8"

RPROVIDES:${PN} += "ruby3.2-rubygem-sigdump ruby3.2-rubygem-sigdump(aarch-64) rubygem(ruby:3.2.0:sigdump) rubygem(ruby:3.2.0:sigdump:0) rubygem(ruby:3.2.0:sigdump:0.2) rubygem(ruby:3.2.0:sigdump:0.2.4) rubygem(sigdump)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
