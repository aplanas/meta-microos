SUMMARY = "Parse Windows Registry Files"
DESCRIPTION = "Parse::Win32Registry is a module for parsing Windows Registry files, \
allowing you to read the keys and values of a registry file without going \
through the Windows API. \
 \
It provides an object-oriented interface to the keys and values in a \
registry file. Registry files are structured as trees of keys, with each \
key containing further subkeys or values. \
 \
The module is intended to be cross-platform, and run on those platforms \
where Perl will run. \
 \
It supports both Windows NT registry files (Windows NT, 2000, XP, 2003, \
Vista, 7) and Windows 95 registry files (Windows 95, 98, Millennium \
Edition). \
 \
It is intended to be used to parse offline registry files. If a registry \
file is currently in use, you will not be able to open it. However, you can \
save part or all of a currently loaded registry file using the Windows reg \
command if you have the appropriate administrative access."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.1"

RPM_NAME = "perl-Parse-Win32Registry-1.1-1.12.noarch.rpm"
RPM_HASH = "286991e9decbb5c6ee7dec5b624f93c7951a53520d527bcd08eaef6a9ba10549ab5c70636c525569481b9a8695956ab86e64d9194edeeb225f68fc7c570933c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Parse::Win32Registry) \
perl(Parse::Win32Registry::ACE) \
perl(Parse::Win32Registry::ACL) \
perl(Parse::Win32Registry::Base) \
perl(Parse::Win32Registry::Entry) \
perl(Parse::Win32Registry::File) \
perl(Parse::Win32Registry::GUID) \
perl(Parse::Win32Registry::Iterator) \
perl(Parse::Win32Registry::Key) \
perl(Parse::Win32Registry::SID) \
perl(Parse::Win32Registry::SecurityDescriptor) \
perl(Parse::Win32Registry::Value) \
perl(Parse::Win32Registry::Win95::File) \
perl(Parse::Win32Registry::Win95::Key) \
perl(Parse::Win32Registry::Win95::RGDB) \
perl(Parse::Win32Registry::Win95::RGDBKey) \
perl(Parse::Win32Registry::Win95::RGKN) \
perl(Parse::Win32Registry::Win95::Value) \
perl(Parse::Win32Registry::WinNT::Entry) \
perl(Parse::Win32Registry::WinNT::File) \
perl(Parse::Win32Registry::WinNT::Hbin) \
perl(Parse::Win32Registry::WinNT::Key) \
perl(Parse::Win32Registry::WinNT::Security) \
perl(Parse::Win32Registry::WinNT::Value) \
perl-Parse-Win32Registry"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
