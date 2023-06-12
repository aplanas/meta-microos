SUMMARY = "System() and background procs w/ piping, redirs, ptys (Unix, Win32)"
DESCRIPTION = "IPC::Run allows you to run and interact with child processes using files, \
pipes, and pseudo-ttys. Both system()-style and scripted usages are \
supported and may be mixed. Likewise, functional and OO API styles are both \
supported and may be mixed. \
 \
Various redirection operators reminiscent of those seen on common Unix and \
DOS command lines are provided."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "20220807.0"

RPM_NAME = "perl-IPC-Run-20220807.0-1.2.noarch.rpm"
RPM_HASH = "17fe9f1dea77d6032507203c1e6648e9773628134534aa4f41cf96cd2673c777a5bfe4e06cea596d9f2cb21b77ec44aa8e984fe6de0c7a22a3c68c6d725bfaee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(IPC::Run) \
perl(IPC::Run::Debug) \
perl(IPC::Run::IO) \
perl(IPC::Run::Timer) \
perl(IPC::Run::Win32Helper) \
perl(IPC::Run::Win32IO) \
perl(IPC::Run::Win32Process) \
perl(IPC::Run::Win32Pump) \
perl-IPC-Run"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(IO::Pty)"

inherit rpm
