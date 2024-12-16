#CS305

# Practices for Secure Software Report

## Who Was the Client and What Issue Did They Want Addressed?
Artemis Financial, a mid-sized financial services company, specializes in online banking and investment platforms. They were concerned about security weaknesses in their web application’s codebase. They wanted to identify and fix code-level vulnerabilities that could potentially expose sensitive customer data or lead to fraudulent transactions.

## What I Did Well in Identifying Software Security Vulnerabilities
I conducted a thorough review of the application’s code using:
- Automated static analysis tools
- Manual code inspections
- Established security standards (e.g., OWASP Top 10)

I documented each issue clearly, detailing its root cause, potential impact, and recommended solutions. Throughout the process, I communicated openly with Artemis Financial’s development and leadership teams, ensuring everyone understood the technical and business implications of each vulnerability. This helped them prioritize fixes based on severity and overall risk.

## Why Secure Coding Matters and Its Value to the Company
Secure coding is vital because it:
- Protects sensitive financial and personal data
- Prevents financial fraud and regulatory non-compliance
- Preserves the company’s reputation and builds customer trust
- Maintains a competitive edge by reducing downtime and costly breaches

By proactively addressing vulnerabilities, Artemis Financial enhances customer confidence, reduces legal risks, and safeguards its brand.

## Challenging and Helpful Aspects of the Vulnerability Assessment
Identifying complex logic flaws, such as subtle privilege escalation or concurrency issues, proved challenging. These weren’t simple syntax errors or common exploit patterns. However, overcoming these challenges:
- Strengthened my critical thinking regarding the application’s design
- Showed the importance of combining automated scans with human-led reviews
- Emphasized understanding the application’s workflow and intended user actions

## Increasing Layers of Security and Future Assessment Techniques
To improve security, I:
- Enforced stricter input validation
- Implemented role-based access controls
- Strengthened data encryption
- Adopted secure session management
- Applied the principle of least privilege

In the future, I would:
- Use automated scanners, dependency checkers, and manual code reviews regularly
- Follow a risk-based approach, addressing the most critical issues first
- Integrate automated security checks into CI/CD pipelines to prevent new vulnerabilities

## Ensuring the Code Remained Functional and Secure
I maintained application functionality by running comprehensive regression tests after each security fix. Post-refactoring, I used automated static and dynamic analysis tools to ensure no new vulnerabilities were introduced. These steps ensured that the updated code was both secure and fully operational.

## Resources, Tools, and Coding Practices for Future Use
I utilized:
- Secure coding standards from OWASP
- Tools like SonarQube and OWASP Dependency-Check
- Coding best practices (e.g., parameterized queries, proper error handling, consistent input/output validation)

Combined with a well-defined secure software development lifecycle (SSDL), these practices and tools will be invaluable in future projects.

## Showcasing This Work to Future Employers
To demonstrate my skills, I can provide:
- A detailed vulnerability assessment report (risks, impacts, and remediation steps)
- Before-and-after code snippets highlighting security improvements
- Documentation of security methodologies, testing frameworks, and CI/CD integrations
- Test results (logs, screenshots) proving that functionality was preserved and no new vulnerabilities were introduced

These artifacts will illustrate my technical proficiency, clear communication, and dedication to delivering secure, high-quality software.
