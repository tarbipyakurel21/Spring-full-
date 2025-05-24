<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Logged Out</title>
    <style>
        body {
            font-family: 'Inter', sans-serif;
            background-color: #f0f2f5;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
        }
        .logout-container {
            background-color: #ffffff;
            padding: 2.5rem;
            border-radius: 0.75rem; /* rounded-xl */
            box-shadow: 0 10px 15px -3px rgba(0, 0, 0, 0.1), 0 4px 6px -2px rgba(0, 0, 0, 0.05); /* shadow-lg */
            width: 100%;
            max-width: 400px;
            text-align: center;
        }
        h2 {
            color: #1a202c; /* text-gray-900 */
            margin-bottom: 1.5rem;
            font-size: 1.875rem; /* text-3xl */
            font-weight: 700; /* font-bold */
        }
        p {
            color: #4a5568; /* text-gray-700 */
            font-size: 1rem;
            margin-bottom: 1.5rem;
        }
        a {
            display: inline-block;
            padding: 0.75rem 1.5rem;
            background-color: #4299e1; /* bg-blue-500 */
            color: white;
            text-decoration: none;
            border-radius: 0.5rem; /* rounded-lg */
            font-weight: 700; /* font-bold */
            transition: background-color 0.2s ease-in-out;
        }
        a:hover {
            background-color: #3182ce; /* bg-blue-600 */
        }
    </style>
</head>
<body>
    <div class="logout-container">
        <h2>You have been logged out!</h2>
        <p>Thank you for using our service.</p>
		
        <a href="/login">Log In Again</a> <%-- Link back to your login page --%>
    </div>
</body>
</html>
