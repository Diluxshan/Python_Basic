import smtplib
server = smtplib.SMTP('smtp.gmail.com', 587)
#mail = smtplib.SMTP('smtp.gmail.com', 587)

#Next, log in to the server
server.login("diluxv@gmail.com", "7353678Dilux")

server.ehlo()
server.starttls()

#Send the mail
msg = "Hello!" # The /n separates the message from the headers
server.sendmail("diluxv@gmail.com", "diluxv@icloud.com", msg)