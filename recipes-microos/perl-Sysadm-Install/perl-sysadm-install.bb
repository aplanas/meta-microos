SUMMARY = "Typical installation tasks for system administrators"
DESCRIPTION = "Have you ever wished for your installation shell scripts to run \
reproducibly, without much programming fuzz, and even with optional logging \
enabled? Then give up shell programming, use Perl. \
 \
'Sysadm::Install' executes shell-like commands performing typical \
installation tasks: Copying files, extracting tarballs, calling 'make'. It \
has a 'fail once and die' policy, meticulously checking the result of every \
operation and calling 'die()' immediately if anything fails. \
 \
'Sysadm::Install' also supports a _dry_run_ mode, in which it logs \
everything, but suppresses any write actions. Dry run mode is enabled by \
calling 'Sysadm::Install::dry_run(1)'. To switch back to normal, call \
'Sysadm::Install::dry_run(0)'. \
 \
As of version 0.17, 'Sysadm::Install' supports a _confirm_ mode, in which \
it interactively asks the user before running any of its functions (just \
like 'rm -i'). _confirm_ mode is enabled by calling \
'Sysadm::Install::confirm(1)'. To switch back to normal, call \
'Sysadm::Install::confirm(0)'. \
 \
'Sysadm::Install' is fully Log4perl-enabled. To start logging, just \
initialize 'Log::Log4perl'. 'Sysadm::Install' acts as a wrapper class, \
meaning that file names and line numbers are reported from the calling \
program's point of view."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.48"

RPM_NAME = "perl-Sysadm-Install-0.48-1.23.noarch.rpm"
RPM_HASH = "b37755d0245e1b35d3345d168526ddc3baf4e2152e4f9a2a5482f5b65e27503dbe8d85d00c9728e4d32f521a370a8ebd6abb0bef2d9059b2c322031880542602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Sysadm::Install) perl-Sysadm-Install"
RDEPENDS:${PN} += "/usr/bin/perl perl(:MODULE_COMPAT_5.36.0) perl(File::Which) perl(LWP::Simple) perl(Log::Log4perl) perl(Term::ReadKey)"

inherit rpm
