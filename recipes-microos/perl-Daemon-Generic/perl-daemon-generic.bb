SUMMARY = "Framework to Provide Start/Stop/Reload for a Daemon"
DESCRIPTION = "Daemon::Generic provides a framework for starting, stopping, reconfiguring \
daemon-like programs. The framework provides for standard commands that \
work for as init.d files and as apachectl-like commands. \
 \
Programs that use Daemon::Generic subclass Daemon::Generic to override its \
behavior. Almost everything that Genric::Daemon does can be overridden as \
needed."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.85"

RPM_NAME = "perl-Daemon-Generic-0.85-1.20.noarch.rpm"
RPM_HASH = "f88fffc983c7f23d3afc259a6d23cbd0681af8b18ed3506ca8321b8c843a46b305d12b58f7be301ba11574a551f5063ffce46cf03f4c7666df00a1aaf60a43aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Daemon::Generic) \
perl(Daemon::Generic::AnyEvent) \
perl(Daemon::Generic::Event) \
perl(Daemon::Generic::While1) \
perl-Daemon-Generic"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(File::Flock) \
perl(File::Slurp)"

inherit rpm
