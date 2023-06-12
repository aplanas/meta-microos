SUMMARY = "Ant for .NET"
DESCRIPTION = "NAnt is a free .NET build tool. In theory it is kind of like make \
without make's wrinkles. In practice it's a lot like Ant."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "0.92+git20130131"

RPM_NAME = "nant-0.92+git20130131-10.14.noarch.rpm"
RPM_HASH = "0bd3020fff195139aacba916dc494ffd4bb5c4dcb68da7c76426745748eec8f05e073631067ce2f2b80cb38379f177a95c41012b9bcc0083d839656555cba2e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono(NAnt) \
mono(NAnt.CompressionTasks) \
mono(NAnt.Core) \
mono(NAnt.DotNetTasks) \
mono(NAnt.MSBuild) \
mono(NAnt.NUnit) \
mono(NAnt.NUnit1Tasks) \
mono(NAnt.NUnit2Tasks) \
mono(NAnt.SourceControlTasks) \
mono(NAnt.VSNetTasks) \
mono(NAnt.VisualCppTasks) \
mono(NAnt.Win32Tasks) \
nant"
RDEPENDS:${PN} += "mono(System) \
mono(System.Configuration) \
mono(System.Data) \
mono(System.Drawing) \
mono(System.Runtime.Remoting) \
mono(System.Web) \
mono(System.Windows.Forms) \
mono(System.Xml) \
mono(mscorlib)"

inherit rpm
