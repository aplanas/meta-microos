SUMMARY = "Mono Addins Framework, MSBuild Support"
DESCRIPTION = "Mono.Addins is a generic framework for creating extensible \
applications, and for creating libraries which extend those \
applications. \
 \
This package contains MSBuild tasks file and target, which allows \
using add-in references directly in a build file (still experimental)."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "mono-addins-msbuild-1.3.3-2.16.noarch.rpm"
RPM_HASH = "298be0bc0121b87c33ef30c68fdeb40eca4c13a36c8c8996d423a68a741cae2ccb44edd69fba878e454996a78499b81c65202bc68b79a39e0f59042db6d8786c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono(Mono.Addins.MSBuild) mono(policy.0.2.Mono.Addins.MSBuild) mono(policy.0.3.Mono.Addins.MSBuild) mono(policy.0.4.Mono.Addins.MSBuild) mono(policy.0.5.Mono.Addins.MSBuild) mono(policy.0.6.Mono.Addins.MSBuild) mono-addins-msbuild"
RDEPENDS:${PN} += "mono(Microsoft.Build.Framework) mono(Microsoft.Build.Utilities.v4.0) mono(Mono.Addins) mono(Mono.Addins.Setup) mono(System) mono(mscorlib) mono-addins"

inherit rpm
