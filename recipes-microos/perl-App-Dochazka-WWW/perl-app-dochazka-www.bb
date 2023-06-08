SUMMARY = "Dochazka Attendance & Time Tracking system web client"
DESCRIPTION = "This is the web client of the Dochazka Attendance & Time Tracking system. \
For more information see the App::Dochazka::REST manpage and the \
App::MFILE::WWW manpage."
LICENSE = "BSD-3-Clause"

PV = "0.155"

RPM_NAME = "perl-App-Dochazka-WWW-0.155-2.17.noarch.rpm"
RPM_HASH = "91873c7f0de0c3727cfdf41f5318d117297e31edabbaec9b649fb2e0137ee7cbfadc10acf9057336bef0d162fc68648fce9e245b49756cd19225a867f32a7639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(perl-App-Dochazka-WWW) perl(App::Dochazka::WWW) perl(App::Dochazka::WWW::Dispatch) perl-App-Dochazka-WWW"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/sbin/groupadd /usr/sbin/useradd perl(:MODULE_COMPAT_5.36.0) perl(App::CELL) perl(App::MFILE::WWW) perl(File::ShareDir)"

inherit rpm
