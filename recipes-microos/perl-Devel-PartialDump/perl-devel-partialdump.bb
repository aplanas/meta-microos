SUMMARY = "Partial dumping of data structures, optimized for argument printing"
DESCRIPTION = "This module is a data dumper optimized for logging of arbitrary parameters. \
 \
It attempts to truncate overly verbose data, in a way that is hopefully \
more useful for diagnostics warnings than \
 \
    warn Dumper(@stuff); \
 \
Unlike other data dumping modules there are no attempts at correctness or \
cross referencing, this is only meant to provide a slightly deeper look \
into the data in question. \
 \
There is a default recursion limit, and a default truncation of long lists, \
and the dump is formatted on one line (new lines in strings are escaped), \
to aid in readability. \
 \
You can enable it temporarily by importing functions like 'warn', 'croak' \
etc to get more informative errors during development, or even use it as: \
 \
    BEGIN { local $@; eval 'use Devel::PartialDump qw(...)' } \
 \
to get DWIM formatting only if it's installed, without introducing a \
dependency."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.20"

RPM_NAME = "perl-Devel-PartialDump-0.20-1.20.noarch.rpm"
RPM_HASH = "c419e137c6a584c2cac64e9196b0faa114aebce36491787a0b6bb33845bff85125cd30b6cc761317ce29c71768df185b56e99b9b0574b26a9d768e6567bc9142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DB) \
perl(Devel::PartialDump) \
perl-Devel-PartialDump"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Tiny) \
perl(Sub::Exporter) \
perl(namespace::clean)"

inherit rpm
